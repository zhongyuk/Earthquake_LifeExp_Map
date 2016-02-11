package module6;

import java.util.List;

import de.fhpotsdam.unfolding.data.Feature;
import de.fhpotsdam.unfolding.data.MultiFeature;
import de.fhpotsdam.unfolding.marker.MultiMarker;

/**
 * @author Zhongyu Kuang
 * @email: dream.kuang@gmail.com
 *
 *
 */
public class CountryMultiMarker extends MultiMarker{
	private List<Feature> countryFeatures;
	private String countryName;
	private String countryID;
	public CountryMultiMarker(Feature country){
		super();
		countryFeatures = ((MultiFeature)country).getFeatures();
		countryName = ((MultiFeature)country).getStringProperty("name");
		countryID = ((MultiFeature)country).getId();
		for(Feature countryFeature : countryFeatures){
			this.addMarkers(new CountryMarker(countryFeature, countryName, countryID));
		}
	}
	public String getName(){
		return countryName;
	}
	public List<Feature> getFeatures(){
		return countryFeatures;
	}
}