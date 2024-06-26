package au.org.aodn.ogcapi.server.core.model.enumeration;

public enum StacBasicField {
    UUID("id", "id"),
    Title("title", "title"),
    Description("description", "description"),
    Providers(
            "providers",    // This result in the whole provider section return
            "providers.name"
    ),
    DiscoveryCategories(
            "discovery_categories", // This result in the whole themes section return
            "summaries.discovery_categories"
    ),
    Links("links", "links")
    ;

    public final String searchField;    // Field in STAC object
    public final String displayField;   // Field that is named externally

    StacBasicField(String displayField, String searchField) {
        this.displayField = displayField;
        this.searchField = searchField;
    }
}
