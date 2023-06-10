
package com.bookmyfarms.bmf.model;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.bookmyfarms.bmf.model.AmenityGroup;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "address",
    "id",
    "check_in_time",
    "check_out_time",
    "star_certificate",
    "star_rating",
    "description_struct",
    "email",
    "facts",
    "front_desk_time_end",
    "front_desk_time_start",
    "hotel_chain",
    "images",
    "is_closed",
    "kind",
    "latitude",
    "longitude",
    "metapolicy_extra_info",
    "metapolicy_struct",
    "name",
    "payment_methods",
    "phone",
    "policy_struct",
    "postal_code",
    "region",
    "room_groups",
    "amenity_groups"
})
public class Data {

    @JsonProperty("address")
    private String address;
    @JsonProperty("id")
    private String id;
    @JsonProperty("check_in_time")
    private String checkInTime;
    @JsonProperty("check_out_time")
    private String checkOutTime;
    @JsonProperty("star_certificate")
    private Object starCertificate;
    @JsonProperty("star_rating")
    private Integer starRating;
    @JsonProperty("description_struct")
    private List<DescriptionStruct> descriptionStruct;
    @JsonProperty("email")
    private String email;
    @JsonProperty("facts")
    private Facts facts;
    @JsonProperty("front_desk_time_end")
    private String frontDeskTimeEnd;
    @JsonProperty("front_desk_time_start")
    private String frontDeskTimeStart;
    @JsonProperty("hotel_chain")
    private String hotelChain;
    @JsonProperty("images")
    private List<String> images;
    @JsonProperty("is_closed")
    private Boolean isClosed;
    @JsonProperty("kind")
    private String kind;
    @JsonProperty("latitude")
    private Double latitude;
    @JsonProperty("longitude")
    private Double longitude;
    @JsonProperty("metapolicy_extra_info")
    private String metapolicyExtraInfo;
    @JsonProperty("metapolicy_struct")
    private MetapolicyStruct metapolicyStruct;
    @JsonProperty("name")
    private String name;
    @JsonProperty("payment_methods")
    private List<String> paymentMethods;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("policy_struct")
    private List<PolicyStruct> policyStruct;
    @JsonProperty("postal_code")
    private String postalCode;
    @JsonProperty("region")
    private Region region;
    @JsonProperty("room_groups")
    private List<RoomGroup> roomGroups;
    @JsonProperty("amenity_groups")
    private List<AmenityGroup> amenityGroups;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("check_in_time")
    public String getCheckInTime() {
        return checkInTime;
    }

    @JsonProperty("check_in_time")
    public void setCheckInTime(String checkInTime) {
        this.checkInTime = checkInTime;
    }

    @JsonProperty("check_out_time")
    public String getCheckOutTime() {
        return checkOutTime;
    }

    @JsonProperty("check_out_time")
    public void setCheckOutTime(String checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    @JsonProperty("star_certificate")
    public Object getStarCertificate() {
        return starCertificate;
    }

    @JsonProperty("star_certificate")
    public void setStarCertificate(Object starCertificate) {
        this.starCertificate = starCertificate;
    }

    @JsonProperty("star_rating")
    public Integer getStarRating() {
        return starRating;
    }

    @JsonProperty("star_rating")
    public void setStarRating(Integer starRating) {
        this.starRating = starRating;
    }

    @JsonProperty("description_struct")
    public List<DescriptionStruct> getDescriptionStruct() {
        return descriptionStruct;
    }

    @JsonProperty("description_struct")
    public void setDescriptionStruct(List<DescriptionStruct> descriptionStruct) {
        this.descriptionStruct = descriptionStruct;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("facts")
    public Facts getFacts() {
        return facts;
    }

    @JsonProperty("facts")
    public void setFacts(Facts facts) {
        this.facts = facts;
    }

    @JsonProperty("front_desk_time_end")
    public String getFrontDeskTimeEnd() {
        return frontDeskTimeEnd;
    }

    @JsonProperty("front_desk_time_end")
    public void setFrontDeskTimeEnd(String frontDeskTimeEnd) {
        this.frontDeskTimeEnd = frontDeskTimeEnd;
    }

    @JsonProperty("front_desk_time_start")
    public String getFrontDeskTimeStart() {
        return frontDeskTimeStart;
    }

    @JsonProperty("front_desk_time_start")
    public void setFrontDeskTimeStart(String frontDeskTimeStart) {
        this.frontDeskTimeStart = frontDeskTimeStart;
    }

    @JsonProperty("hotel_chain")
    public String getHotelChain() {
        return hotelChain;
    }

    @JsonProperty("hotel_chain")
    public void setHotelChain(String hotelChain) {
        this.hotelChain = hotelChain;
    }

    @JsonProperty("images")
    public List<String> getImages() {
        return images;
    }

    @JsonProperty("images")
    public void setImages(List<String> images) {
        this.images = images;
    }

    @JsonProperty("is_closed")
    public Boolean getIsClosed() {
        return isClosed;
    }

    @JsonProperty("is_closed")
    public void setIsClosed(Boolean isClosed) {
        this.isClosed = isClosed;
    }

    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    @JsonProperty("latitude")
    public Double getLatitude() {
        return latitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    @JsonProperty("longitude")
    public Double getLongitude() {
        return longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @JsonProperty("metapolicy_extra_info")
    public String getMetapolicyExtraInfo() {
        return metapolicyExtraInfo;
    }

    @JsonProperty("metapolicy_extra_info")
    public void setMetapolicyExtraInfo(String metapolicyExtraInfo) {
        this.metapolicyExtraInfo = metapolicyExtraInfo;
    }

    @JsonProperty("metapolicy_struct")
    public MetapolicyStruct getMetapolicyStruct() {
        return metapolicyStruct;
    }

    @JsonProperty("metapolicy_struct")
    public void setMetapolicyStruct(MetapolicyStruct metapolicyStruct) {
        this.metapolicyStruct = metapolicyStruct;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("payment_methods")
    public List<String> getPaymentMethods() {
        return paymentMethods;
    }

    @JsonProperty("payment_methods")
    public void setPaymentMethods(List<String> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonProperty("policy_struct")
    public List<PolicyStruct> getPolicyStruct() {
        return policyStruct;
    }

    @JsonProperty("policy_struct")
    public void setPolicyStruct(List<PolicyStruct> policyStruct) {
        this.policyStruct = policyStruct;
    }

    @JsonProperty("postal_code")
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty("postal_code")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @JsonProperty("region")
    public Region getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(Region region) {
        this.region = region;
    }

    @JsonProperty("room_groups")
    public List<RoomGroup> getRoomGroups() {
        return roomGroups;
    }

    @JsonProperty("room_groups")
    public void setRoomGroups(List<RoomGroup> roomGroups) {
        this.roomGroups = roomGroups;
    }

    @JsonProperty("amenity_groups")
    public List<AmenityGroup> getAmenityGroups() {
        return amenityGroups;
    }

    @JsonProperty("amenity_groups")
    public void setAmenityGroups(List<AmenityGroup> amenityGroups) {
        this.amenityGroups = amenityGroups;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
