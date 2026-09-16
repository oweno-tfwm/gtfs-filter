package be.ugent.intec.gtfsfilter;

import java.io.Serializable;
import java.util.Collection;

import org.onebusaway.gtfs.model.Agency;
import org.onebusaway.gtfs.model.AgencyAndId;
import org.onebusaway.gtfs.model.Area;
import org.onebusaway.gtfs.model.Block;
import org.onebusaway.gtfs.model.BookingRule;
import org.onebusaway.gtfs.model.DirectionEntry;
import org.onebusaway.gtfs.model.FareAttribute;
import org.onebusaway.gtfs.model.FareLegRule;
import org.onebusaway.gtfs.model.FareMedium;
import org.onebusaway.gtfs.model.FareProduct;
import org.onebusaway.gtfs.model.FareRule;
import org.onebusaway.gtfs.model.FareTransferRule;
import org.onebusaway.gtfs.model.FeedInfo;
import org.onebusaway.gtfs.model.Frequency;
import org.onebusaway.gtfs.model.Level;
import org.onebusaway.gtfs.model.Location;
import org.onebusaway.gtfs.model.LocationGroup;
import org.onebusaway.gtfs.model.LocationGroupElement;
import org.onebusaway.gtfs.model.Network;
import org.onebusaway.gtfs.model.Pathway;
import org.onebusaway.gtfs.model.RiderCategory;
import org.onebusaway.gtfs.model.Ridership;
import org.onebusaway.gtfs.model.Route;
import org.onebusaway.gtfs.model.RouteNetworkAssignment;
import org.onebusaway.gtfs.model.ServiceCalendar;
import org.onebusaway.gtfs.model.ServiceCalendarDate;
import org.onebusaway.gtfs.model.ShapePoint;
import org.onebusaway.gtfs.model.Stop;
import org.onebusaway.gtfs.model.StopAreaElement;
import org.onebusaway.gtfs.model.StopLocation;
import org.onebusaway.gtfs.model.StopTime;
import org.onebusaway.gtfs.model.Timeframe;
import org.onebusaway.gtfs.model.Transfer;
import org.onebusaway.gtfs.model.Translation;
import org.onebusaway.gtfs.model.Trip;
import org.onebusaway.gtfs.model.Vehicle;
import org.onebusaway.gtfs.services.GtfsDao;




public abstract class GtfsDaoFilter implements GtfsDao {

	protected final GtfsDao input;

	protected GtfsDaoFilter(GtfsDao input) {
		this.input = input;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> Collection<T> getAllEntitiesForType(Class<T> type) {
		
		if(type == Agency.class)
			return (Collection<T>) getAllAgencies();
		else if(type == ShapePoint.class)
			return (Collection<T>) getAllShapePoints();
		else if(type == Route.class)
			return (Collection<T>) getAllRoutes();
		else if(type == Stop.class)
			return (Collection<T>) getAllStops();
		else if(type == StopLocation.class)
			return (Collection<T>) getAllStops();
		else if(type == Trip.class)
			return (Collection<T>) getAllTrips();
		else if (type == StopTime.class)
			return (Collection<T>) getAllStopTimes();
		else if (type == ServiceCalendar.class)
			return (Collection<T>) getAllCalendars();
		else if (type == ServiceCalendarDate.class)
			return (Collection<T>) getAllCalendarDates();
		else if(type ==FareAttribute.class)
			return (Collection<T>) getAllFareAttributes();
		else if(type == FareRule.class)
			return (Collection<T>) getAllFareRules();
		else if(type == Frequency.class)
			return (Collection<T>) getAllFrequencies();
		else if (type == Pathway.class)
			return (Collection<T>) getAllPathways();
		else if (type == Transfer.class)
			return (Collection<T>) getAllTransfers();
		else if (type == DirectionEntry.class)
			return (Collection<T>) getAllDirectionEntries();
		else if (type == Network.class)
			return (Collection<T>) getAllNetworks();
		else if (type == Translation.class)
			return (Collection<T>) getAllTranslations();
		else if (type == Timeframe.class)
			return (Collection<T>) getAllTimeframes();
		else if (type == BookingRule.class)
			return (Collection<T>) getAllBookingRules();
		else if (type == Location.class)
			return (Collection<T>) getAllLocations();
		else if (type == StopAreaElement.class)
			return (Collection<T>) getAllStopAreaElements();
		else if (type == LocationGroup.class)
			return (Collection<T>) getAllLocationGroups();
		else if (type == LocationGroupElement.class)
			return (Collection<T>) getAllLocationGroupElements();
		else if (type == Area.class)
			return (Collection<T>) getAllAreas();
		else if (type == Vehicle.class)
			return (Collection<T>) getAllVehicles();
		else if (type == Ridership.class)
			return (Collection<T>) getAllRiderships();
		else if (type == Block.class)
			return (Collection<T>) getAllBlocks();
		else if (type == RouteNetworkAssignment.class)
			return (Collection<T>) getAllRouteNetworkAssignments();
		else if (type == Level.class)
			return (Collection<T>) getAllLevels();
		else if (type == FeedInfo.class)
			return (Collection<T>) getAllFeedInfos();
		else if (type == FareLegRule.class)
			return (Collection<T>) getAllFareLegRules();
		else if (type == FareProduct.class)
			return (Collection<T>) getAllFareProducts();
		else if (type == FareMedium.class)
			return (Collection<T>) getAllFareMedia();
		else if (type == RiderCategory.class)
			return (Collection<T>) getAllRiderCategories();
		else if (type == FareTransferRule.class)
			return (Collection<T>) getAllFareTransferRules();		
		else
			return input.getAllEntitiesForType( type );
	}

	@Override
	public <T> T getEntityForId(Class<T> type, Serializable id) {
		return input.getEntityForId(type, id);
	}

	@Override
	public Collection<Agency> getAllAgencies() {
		return input.getAllAgencies();
	}

	@Override
	public Agency getAgencyForId(String id) {
		return input.getAgencyForId(id);
	}

	@Override
	public Collection<ServiceCalendar> getAllCalendars() {
		return input.getAllCalendars();
	}

	@Override
	public ServiceCalendar getCalendarForId(int id) {
		return input.getCalendarForId(id);
	}

	@Override
	public Collection<ServiceCalendarDate> getAllCalendarDates() {
		return input.getAllCalendarDates();
	}

	@Override
	public ServiceCalendarDate getCalendarDateForId(int id) {
		return input.getCalendarDateForId(id);
	}

	@Override
	public Collection<FareAttribute> getAllFareAttributes() {
		return input.getAllFareAttributes();
	}

	@Override
	public FareAttribute getFareAttributeForId(AgencyAndId id) {
		return input.getFareAttributeForId(id);
	}

	@Override
	public Collection<FareRule> getAllFareRules() {
		return input.getAllFareRules();
	}

	@Override
	public FareRule getFareRuleForId(int id) {
		return input.getFareRuleForId(id);
	}

	@Override
	public Collection<Frequency> getAllFrequencies() {
		return input.getAllFrequencies();
	}

	@Override
	public Frequency getFrequencyForId(int id) {
		return input.getFrequencyForId(id);
	}

	@Override
	public Collection<Pathway> getAllPathways() {
		return input.getAllPathways();
	}

	@Override
	public Pathway getPathwayForId(AgencyAndId id) {
		return input.getPathwayForId(id);
	}

	@Override
	public Collection<Route> getAllRoutes() {
		return input.getAllRoutes();
	}

	@Override
	public Route getRouteForId(AgencyAndId id) {
		return input.getRouteForId(id);
	}

	@Override
	public Collection<ShapePoint> getAllShapePoints() {
		return input.getAllShapePoints();
	}

	@Override
	public ShapePoint getShapePointForId(int id) {
		return input.getShapePointForId(id);
	}

	@Override
	public Collection<Stop> getAllStops() {
		return input.getAllStops();
	}

	@Override
	public Stop getStopForId(AgencyAndId id) {
		return input.getStopForId(id);
	}

	@Override
	public Collection<StopTime> getAllStopTimes() {
		return input.getAllStopTimes();
	}

	@Override
	public StopTime getStopTimeForId(int id) {
		return input.getStopTimeForId(id);
	}

	@Override
	public Collection<Transfer> getAllTransfers() {
		return input.getAllTransfers();
	}

	@Override
	public Transfer getTransferForId(int id) {
		return input.getTransferForId(id);
	}

	@Override
	public Collection<Trip> getAllTrips() {
		return input.getAllTrips();
	}

	@Override
	public Trip getTripForId(AgencyAndId id) {
		return input.getTripForId(id);
	}

	@Override
	public Collection<DirectionEntry> getAllDirectionEntries() {
		return input.getAllDirectionEntries();
	}

	@Override
	public Collection<Network> getAllNetworks() {
		return input.getAllNetworks();
	}

	@Override
	public Collection<Translation> getAllTranslations() {
		return input.getAllTranslations();
	}

	@Override
	public Collection<Timeframe> getAllTimeframes() {
		return input.getAllTimeframes();
	}

	@Override
	public Collection<BookingRule> getAllBookingRules() {
		return input.getAllBookingRules();
	}

	@Override
	public Collection<Location> getAllLocations() {
		return input.getAllLocations();
	}

	@Override
	public Collection<StopAreaElement> getAllStopAreaElements() {
		return input.getAllStopAreaElements();
	}
	
	@Override
	public Collection<LocationGroup> getAllLocationGroups() {
		return input.getAllLocationGroups();
	}

	@Override
	public Collection<LocationGroupElement> getAllLocationGroupElements() {
		return input.getAllLocationGroupElements();
	}

	@Override
	public Collection<Area> getAllAreas() {
		return input.getAllAreas();
	}

	@Override
	public Vehicle getVehicleForId(AgencyAndId id) {
		return input.getVehicleForId( id );
	}

	@Override
	public Collection<Vehicle> getAllVehicles() {
		return input.getAllVehicles();
	}

	@Override
	public Collection<Ridership> getAllRiderships() {
		return input.getAllRiderships();
	}

	@Override
	public Block getBlockForId(int id) {
		return input.getBlockForId( id );
	}

	@Override
	public Collection<Block> getAllBlocks() {
		return input.getAllBlocks();
	}

	@Override
	public Collection<RouteNetworkAssignment> getAllRouteNetworkAssignments() {
		return input.getAllRouteNetworkAssignments();
	}

	@Override
	public Level getLevelForId(AgencyAndId id) {
		return input.getLevelForId( id );
	}

	@Override
	public Collection<Level> getAllLevels() {
		return input.getAllLevels();
	}

	@Override
	public FeedInfo getFeedInfoForId(String id) {
		return input.getFeedInfoForId( id );
	}

	@Override
	public Collection<FeedInfo> getAllFeedInfos() {
		return input.getAllFeedInfos();
	}
  
	@Override
	public Collection<FareLegRule> getAllFareLegRules() {
		return input.getAllFareLegRules();
	}

	@Override
	public FareProduct getFareProductForId(AgencyAndId id) {
		return input.getFareProductForId( id );
	}

	@Override
	public Collection<FareProduct> getAllFareProducts() {
		return input.getAllFareProducts();
	}

	@Override
	public Collection<FareMedium> getAllFareMedia() {
		return input.getAllFareMedia();
	}

	@Override
	public Collection<RiderCategory> getAllRiderCategories() {
		return input.getAllRiderCategories();
	}

	@Override
	public Collection<FareTransferRule> getAllFareTransferRules() {
		return input.getAllFareTransferRules();
	}




}
