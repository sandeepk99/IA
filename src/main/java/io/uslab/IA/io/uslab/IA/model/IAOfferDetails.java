package io.uslab.IA.io.uslab.IA.model;

public class IAOfferDetails {

    private String pageId;
    private String description;

    String placementId;
    String offerId;
    String placementUrl;

    public IAOfferDetails(String pageId, String description,
                          String placementId,String offerId,String placementUrl) {
        super();
        this.pageId = pageId;
        this.description=description;
        this.placementId=placementId;
        this.offerId=offerId;
        this.placementUrl=placementUrl;
    }

    public String getPlacementId() {
        return placementId;
    }

    public String getOfferId() {
        return offerId;
    }

    public String getPlacementUrl() {
        return placementUrl;
    }



    public String getDescription() {
        return description;
    }

    public IAOfferDetails() {
    }



    public String getPageId() {
        return pageId;
    }


}
