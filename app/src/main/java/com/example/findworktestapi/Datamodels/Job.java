package com.example.findworktestapi.Datamodels;

import com.google.gson.annotations.SerializedName;

public class Job {


    @SerializedName("account_name")
    private String accountName;
    @SerializedName("subject")
    private String subject;
    @SerializedName("area_name")
    private String areaName;
    @SerializedName("region_name")
    private String regionName;
    @SerializedName("price_string")
    private String priceString;
    @SerializedName("image")
    private String image;
    @SerializedName("avatar")
    private String avatar;
    @SerializedName("min_salary")
    private int minSalary;
    @SerializedName("max_salary")
    private int maxSalary;
    @SerializedName("ward_name")
    private String wardName;
    @SerializedName("company_name")
    private String companyName;
    @SerializedName("min_age")
    private int minAge;
    @SerializedName("max_age")
    private int maxAge;
    @SerializedName("detail_address")
    private String detailAddress;
    @SerializedName("date")
    private String date;
    @SerializedName("body")
    private String body;

    public Job(String accountName, String subject, String areaName, String regionName, String priceString, String image, String avatar, int minSalary, int maxSalary, String wardName, String companyName, int minAge, int maxAge, String detailAddress, String date, String body) {
        this.accountName = accountName;
        this.subject = subject;
        this.areaName = areaName;
        this.regionName = regionName;
        this.priceString = priceString;
        this.image = image;
        this.avatar = avatar;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.wardName = wardName;
        this.companyName = companyName;
        this.minAge = minAge;
        this.maxAge = maxAge;
        this.detailAddress = detailAddress;
        this.date = date;
        this.body = body;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getPriceString() {
        return priceString;
    }

    public void setPriceString(String priceString) {
        this.priceString = priceString;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }

    public String getWardName() {
        return wardName;
    }

    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
