package KCKitProject.models;

//Entity?

class MapPoint {
    private double lat;
    private double lng;

    public MapPoint(double lat, double lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }
}
