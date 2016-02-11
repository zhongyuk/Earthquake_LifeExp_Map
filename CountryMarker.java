package module6;

import java.util.List;

import processing.core.PConstants;
import processing.core.PGraphics;
import de.fhpotsdam.unfolding.marker.SimplePolygonMarker;
import de.fhpotsdam.unfolding.data.Feature;
import de.fhpotsdam.unfolding.utils.MapPosition;
import de.fhpotsdam.unfolding.data.ShapeFeature;

/**
 * @author Zhongyu Kuang
 * @email: dream.kuang@gmail.com
 *
 * A class customizes and draws out country on map
 *
 */

public class CountryMarker extends SimplePolygonMarker {
	//protected boolean clicked = false;
	//constructor
	private String countryName;
	private String countryID;
	public CountryMarker(){
		super();
	}
	public CountryMarker(Feature country){
		super(((ShapeFeature)country).getLocations(),((ShapeFeature)country).getProperties());
		countryName = this.getStringProperty("name");
		countryID = this.getId();
	}
	public CountryMarker(Feature country, String name, String ID){
		super(((ShapeFeature)country).getLocations(),((ShapeFeature)country).getProperties());
		countryName = name;
		countryID = ID;
	}
	public String getName(){
		if(countryName==null){
			countryName = this.getStringProperty("name");
		}
		return countryName;
	}
	
	public String getID(){
		return countryID;
	}
	
	public void draw(PGraphics pg, List<MapPosition> mapPositions){
		if (selected){
			pg.pushStyle();
			pg.strokeWeight(2);
			pg.stroke(0, 0, 0);
			pg.fill(255, 0, 0, 77);
			pg.beginShape();
			for (MapPosition mapPosition : mapPositions) {
				pg.vertex(mapPosition.x, mapPosition.y);
			}
			pg.endShape();

			pg.popStyle();
			//showCountry(pg);
		}
	}
	public void showCountry(PGraphics pg){
		pg.pushStyle();
		pg.fill(0);
		pg.textAlign(PConstants.LEFT, PConstants.TOP);
		pg.textSize(12);
		pg.text("yes", -150, 400);
		pg.popStyle();
	}
}