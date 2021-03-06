package com.bakkenbaeck.token.model.network;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.squareup.moshi.Json;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDetails {

    @JsonProperty
    private String username;

    @JsonProperty
    private Boolean is_app;

    @Json(name = "public")
    private Boolean is_public;

    @JsonProperty
    private String payment_address;

    @JsonProperty
    private String avatar;

    @JsonProperty
    private String name;

    @JsonProperty
    private String about;

    @JsonProperty
    private UserDetailsCustomPayload custom;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Boolean getIs_app() {
        return is_app;
    }

    public void setIs_app(Boolean is_app) {
        this.is_app = is_app;
    }

    public String getPayment_address() {
        return payment_address;
    }

    public void setPayment_address(String payment_address) {
        this.payment_address = payment_address;
    }

    public UserDetailsCustomPayload getCustom() {
        return custom;
    }

    public void setCustom(UserDetailsCustomPayload custom) {
        this.custom = custom;
    }

    public UserDetails() {
        this.custom = new UserDetailsCustomPayload();
    }

    public void setIs_public(Boolean is_public) {
        this.is_public = is_public;
    }

    public Boolean getIs_public() {
        return is_public;
    }

    public void setPublic(Boolean is_public) {
        this.is_public = is_public;
    }

    public Boolean isPublic() {
        return is_public;
    }

}
