package au.org.aodn.ogcapi.server.core.model.enumeration;

public enum StacExtent {
    Temporal("extent.temporal");

    public final String field;
    public static final String path = "extent";

    StacExtent(String s) { field = s;}
}
