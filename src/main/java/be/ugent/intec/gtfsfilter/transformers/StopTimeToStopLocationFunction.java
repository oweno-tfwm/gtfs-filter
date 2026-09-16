package be.ugent.intec.gtfsfilter.transformers;

import org.onebusaway.gtfs.model.Stop;
import org.onebusaway.gtfs.model.StopLocation;
import org.onebusaway.gtfs.model.StopTime;

import com.google.common.base.Function;

public final class StopTimeToStopLocationFunction implements
		Function<StopTime, StopLocation> {
	@Override
	public StopLocation apply(StopTime input) {
		return input.getStop();
	}
}