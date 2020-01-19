package com.example.todomvvmsample.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Metadata {

    @SerializedName("icon_vector")
    @Expose
    private String iconVector;
    @SerializedName("states_targeting")
    @Expose
    private String statesTargeting;
    @SerializedName("shortcut_key")
    @Expose
    private Integer shortcutKey;
    @SerializedName("menu_display")
    @Expose
    private Integer menuDisplay;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("user_state")
    @Expose
    private Integer userState;
    @SerializedName("is_enabled")
    @Expose
    private Boolean isEnabled;
    @SerializedName("nav_id")
    @Expose
    private String navId;
    @SerializedName("imageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("min_ver")
    @Expose
    private String minVer;
    @SerializedName("max_ver")
    @Expose
    private String maxVer;
    @SerializedName("partner_specific_targeting")
    @Expose
    private String partnerSpecificTargeting;
    @SerializedName("icon_vector_focused")
    @Expose
    private String iconVectorFocused;
    @SerializedName("ref_id")
    @Expose
    private String refId;

    public String getIconVector() {
        return iconVector;
    }

    public void setIconVector(String iconVector) {
        this.iconVector = iconVector;
    }

    public String getStatesTargeting() {
        return statesTargeting;
    }

    public void setStatesTargeting(String statesTargeting) {
        this.statesTargeting = statesTargeting;
    }

    public Integer getShortcutKey() {
        return shortcutKey;
    }

    public void setShortcutKey(Integer shortcutKey) {
        this.shortcutKey = shortcutKey;
    }

    public Integer getMenuDisplay() {
        return menuDisplay;
    }

    public void setMenuDisplay(Integer menuDisplay) {
        this.menuDisplay = menuDisplay;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getUserState() {
        return userState;
    }

    public void setUserState(Integer userState) {
        this.userState = userState;
    }

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public String getNavId() {
        return navId;
    }

    public void setNavId(String navId) {
        this.navId = navId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getMinVer() {
        return minVer;
    }

    public void setMinVer(String minVer) {
        this.minVer = minVer;
    }

    public String getMaxVer() {
        return maxVer;
    }

    public void setMaxVer(String maxVer) {
        this.maxVer = maxVer;
    }

    public String getPartnerSpecificTargeting() {
        return partnerSpecificTargeting;
    }

    public void setPartnerSpecificTargeting(String partnerSpecificTargeting) {
        this.partnerSpecificTargeting = partnerSpecificTargeting;
    }

    public String getIconVectorFocused() {
        return iconVectorFocused;
    }

    public void setIconVectorFocused(String iconVectorFocused) {
        this.iconVectorFocused = iconVectorFocused;
    }

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }

}
