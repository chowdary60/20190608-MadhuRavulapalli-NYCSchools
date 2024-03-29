package com.virtusa.nycschools.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by madhu on 6/8/19.
 */
// school names model
public class SchoolsModel {
    @SerializedName("dbn")
    @Expose
    private String dbn;
    @SerializedName("school_name")
    @Expose
    private String school_name;
    @SerializedName("boro")
    @Expose
    private String boro;
    @SerializedName("overview_paragraph")
    @Expose
    private String overview_paragraph;
    @SerializedName("school_10th_seats")
    @Expose
    private String school_10th_seats;
    @SerializedName("academicopportunities1")
    @Expose
    private String academicopportunities1;
    @SerializedName("academicopportunities2")
    @Expose
    private String academicopportunities2;
    @SerializedName("ell_programs")
    @Expose
    private String ell_programs;
    @SerializedName("neighborhood")
    @Expose
    private String neighborhood;
    @SerializedName("building_code")
    @Expose
    private String building_code;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("phone_number")
    @Expose
    private String phone_number;
    @SerializedName("fax_number")
    @Expose
    private String fax_number;
    @SerializedName("school_email")
    @Expose
    private String school_email;
    @SerializedName("website")
    @Expose
    private String website;
    @SerializedName("subway")
    @Expose
    private String subway;
    @SerializedName("bus")
    @Expose
    private String bus;
    @SerializedName("grades2018")
    @Expose
    private String grades2018;
    @SerializedName("finalgrades")
    @Expose
    private String finalgrades;
    @SerializedName("total_students")
    @Expose
    private String total_students;
    @SerializedName("extracurricular_activities")
    @Expose
    private String extracurricular_activities;
    @SerializedName("school_sports")
    @Expose
    private String school_sports;
    @SerializedName("attendance_rate")
    @Expose
    private String attendance_rate;
    @SerializedName("pct_stu_enough_variety")
    @Expose
    private String pct_stu_enough_variety;
    @SerializedName("pct_stu_safe")
    @Expose
    private String pct_stu_safe;
    @SerializedName("school_accessibility_description")
    @Expose
    private String school_accessibility_description;
    @SerializedName("directions1")
    @Expose
    private String directions1;
    @SerializedName("requirement1_1")
    @Expose
    private String requirement1_1;
    @SerializedName("requirement2_1")
    @Expose
    private String requirement2_1;
    @SerializedName("requirement3_1")
    @Expose
    private String requirement3_1;
    @SerializedName("requirement4_1")
    @Expose
    private String requirement4_1;
    @SerializedName("requirement5_1")
    @Expose
    private String requirement5_1;
    @SerializedName("offer_rate1")
    @Expose
    private String offer_rate1;
    @SerializedName("program1")
    @Expose
    private String program1;
    @SerializedName("code1")
    @Expose
    private String code1;
    @SerializedName("interest1")
    @Expose
    private String interest1;
    @SerializedName("method1")
    @Expose
    private String method1;
    @SerializedName("seats9ge1")
    @Expose
    private String seats9ge1;
    @SerializedName("grade9gefilledflag1")
    @Expose
    private String grade9gefilledflag1;
    @SerializedName("grade9geapplicants1")
    @Expose
    private String grade9geapplicants1;
    @SerializedName("seats9swd1")
    @Expose
    private String seats9swd1;
    @SerializedName("grade9swdfilledflag1")
    @Expose
    private String grade9swdfilledflag1;
    @SerializedName("grade9swdapplicants1")
    @Expose
    private String grade9swdapplicants1;
    @SerializedName("seats101")
    @Expose
    private String seats101;
    @SerializedName("admissionspriority11")
    @Expose
    private String admissionspriority11;
    @SerializedName("admissionspriority21")
    @Expose
    private String admissionspriority21;
    @SerializedName("admissionspriority31")
    @Expose
    private String admissionspriority31;
    @SerializedName("grade9geapplicantsperseat1")
    @Expose
    private String grade9geapplicantsperseat1;
    @SerializedName("grade9swdapplicantsperseat1")
    @Expose
    private String grade9swdapplicantsperseat1;
    @SerializedName("primary_address_line_1")
    @Expose
    private String primary_address_line_1;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("zip")
    @Expose
    private String zip;
    @SerializedName("state_code")
    @Expose
    private String state_code;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("community_board")
    @Expose
    private String community_board;
    @SerializedName("council_district")
    @Expose
    private String council_district;
    @SerializedName("census_tract")
    @Expose
    private String census_tract;
    @SerializedName("bin")
    @Expose
    private String bin;
    @SerializedName("bbl")
    @Expose
    private String bbl;

    public String getDbn() {
        return dbn;
    }

    public void setDbn(String dbn) {
        this.dbn = dbn;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public String getBoro() {
        return boro;
    }

    public void setBoro(String boro) {
        this.boro = boro;
    }

    public String getOverview_paragraph() {
        return overview_paragraph;
    }

    public void setOverview_paragraph(String overview_paragraph) {
        this.overview_paragraph = overview_paragraph;
    }

    public String getSchool_10th_seats() {
        return school_10th_seats;
    }

    public void setSchool_10th_seats(String school_10th_seats) {
        this.school_10th_seats = school_10th_seats;
    }

    public String getAcademicopportunities1() {
        return academicopportunities1;
    }

    public void setAcademicopportunities1(String academicopportunities1) {
        this.academicopportunities1 = academicopportunities1;
    }

    public String getAcademicopportunities2() {
        return academicopportunities2;
    }

    public void setAcademicopportunities2(String academicopportunities2) {
        this.academicopportunities2 = academicopportunities2;
    }

    public String getEll_programs() {
        return ell_programs;
    }

    public void setEll_programs(String ell_programs) {
        this.ell_programs = ell_programs;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getBuilding_code() {
        return building_code;
    }

    public void setBuilding_code(String building_code) {
        this.building_code = building_code;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getFax_number() {
        return fax_number;
    }

    public void setFax_number(String fax_number) {
        this.fax_number = fax_number;
    }

    public String getSchool_email() {
        return school_email;
    }

    public void setSchool_email(String school_email) {
        this.school_email = school_email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getSubway() {
        return subway;
    }

    public void setSubway(String subway) {
        this.subway = subway;
    }

    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    public String getGrades2018() {
        return grades2018;
    }

    public void setGrades2018(String grades2018) {
        this.grades2018 = grades2018;
    }

    public String getFinalgrades() {
        return finalgrades;
    }

    public void setFinalgrades(String finalgrades) {
        this.finalgrades = finalgrades;
    }

    public String getTotal_students() {
        return total_students;
    }

    public void setTotal_students(String total_students) {
        this.total_students = total_students;
    }

    public String getExtracurricular_activities() {
        return extracurricular_activities;
    }

    public void setExtracurricular_activities(String extracurricular_activities) {
        this.extracurricular_activities = extracurricular_activities;
    }

    public String getSchool_sports() {
        return school_sports;
    }

    public void setSchool_sports(String school_sports) {
        this.school_sports = school_sports;
    }

    public String getAttendance_rate() {
        return attendance_rate;
    }

    public void setAttendance_rate(String attendance_rate) {
        this.attendance_rate = attendance_rate;
    }

    public String getPct_stu_enough_variety() {
        return pct_stu_enough_variety;
    }

    public void setPct_stu_enough_variety(String pct_stu_enough_variety) {
        this.pct_stu_enough_variety = pct_stu_enough_variety;
    }

    public String getPct_stu_safe() {
        return pct_stu_safe;
    }

    public void setPct_stu_safe(String pct_stu_safe) {
        this.pct_stu_safe = pct_stu_safe;
    }

    public String getSchool_accessibility_description() {
        return school_accessibility_description;
    }

    public void setSchool_accessibility_description(String school_accessibility_description) {
        this.school_accessibility_description = school_accessibility_description;
    }

    public String getDirections1() {
        return directions1;
    }

    public void setDirections1(String directions1) {
        this.directions1 = directions1;
    }

    public String getRequirement1_1() {
        return requirement1_1;
    }

    public void setRequirement1_1(String requirement1_1) {
        this.requirement1_1 = requirement1_1;
    }

    public String getRequirement2_1() {
        return requirement2_1;
    }

    public void setRequirement2_1(String requirement2_1) {
        this.requirement2_1 = requirement2_1;
    }

    public String getRequirement3_1() {
        return requirement3_1;
    }

    public void setRequirement3_1(String requirement3_1) {
        this.requirement3_1 = requirement3_1;
    }

    public String getRequirement4_1() {
        return requirement4_1;
    }

    public void setRequirement4_1(String requirement4_1) {
        this.requirement4_1 = requirement4_1;
    }

    public String getRequirement5_1() {
        return requirement5_1;
    }

    public void setRequirement5_1(String requirement5_1) {
        this.requirement5_1 = requirement5_1;
    }

    public String getOffer_rate1() {
        return offer_rate1;
    }

    public void setOffer_rate1(String offer_rate1) {
        this.offer_rate1 = offer_rate1;
    }

    public String getProgram1() {
        return program1;
    }

    public void setProgram1(String program1) {
        this.program1 = program1;
    }

    public String getCode1() {
        return code1;
    }

    public void setCode1(String code1) {
        this.code1 = code1;
    }

    public String getInterest1() {
        return interest1;
    }

    public void setInterest1(String interest1) {
        this.interest1 = interest1;
    }

    public String getMethod1() {
        return method1;
    }

    public void setMethod1(String method1) {
        this.method1 = method1;
    }

    public String getSeats9ge1() {
        return seats9ge1;
    }

    public void setSeats9ge1(String seats9ge1) {
        this.seats9ge1 = seats9ge1;
    }

    public String getGrade9gefilledflag1() {
        return grade9gefilledflag1;
    }

    public void setGrade9gefilledflag1(String grade9gefilledflag1) {
        this.grade9gefilledflag1 = grade9gefilledflag1;
    }

    public String getGrade9geapplicants1() {
        return grade9geapplicants1;
    }

    public void setGrade9geapplicants1(String grade9geapplicants1) {
        this.grade9geapplicants1 = grade9geapplicants1;
    }

    public String getSeats9swd1() {
        return seats9swd1;
    }

    public void setSeats9swd1(String seats9swd1) {
        this.seats9swd1 = seats9swd1;
    }

    public String getGrade9swdfilledflag1() {
        return grade9swdfilledflag1;
    }

    public void setGrade9swdfilledflag1(String grade9swdfilledflag1) {
        this.grade9swdfilledflag1 = grade9swdfilledflag1;
    }

    public String getGrade9swdapplicants1() {
        return grade9swdapplicants1;
    }

    public void setGrade9swdapplicants1(String grade9swdapplicants1) {
        this.grade9swdapplicants1 = grade9swdapplicants1;
    }

    public String getSeats101() {
        return seats101;
    }

    public void setSeats101(String seats101) {
        this.seats101 = seats101;
    }

    public String getAdmissionspriority11() {
        return admissionspriority11;
    }

    public void setAdmissionspriority11(String admissionspriority11) {
        this.admissionspriority11 = admissionspriority11;
    }

    public String getAdmissionspriority21() {
        return admissionspriority21;
    }

    public void setAdmissionspriority21(String admissionspriority21) {
        this.admissionspriority21 = admissionspriority21;
    }

    public String getAdmissionspriority31() {
        return admissionspriority31;
    }

    public void setAdmissionspriority31(String admissionspriority31) {
        this.admissionspriority31 = admissionspriority31;
    }

    public String getGrade9geapplicantsperseat1() {
        return grade9geapplicantsperseat1;
    }

    public void setGrade9geapplicantsperseat1(String grade9geapplicantsperseat1) {
        this.grade9geapplicantsperseat1 = grade9geapplicantsperseat1;
    }

    public String getGrade9swdapplicantsperseat1() {
        return grade9swdapplicantsperseat1;
    }

    public void setGrade9swdapplicantsperseat1(String grade9swdapplicantsperseat1) {
        this.grade9swdapplicantsperseat1 = grade9swdapplicantsperseat1;
    }

    public String getPrimary_address_line_1() {
        return primary_address_line_1;
    }

    public void setPrimary_address_line_1(String primary_address_line_1) {
        this.primary_address_line_1 = primary_address_line_1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getState_code() {
        return state_code;
    }

    public void setState_code(String state_code) {
        this.state_code = state_code;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getCommunity_board() {
        return community_board;
    }

    public void setCommunity_board(String community_board) {
        this.community_board = community_board;
    }

    public String getCouncil_district() {
        return council_district;
    }

    public void setCouncil_district(String council_district) {
        this.council_district = council_district;
    }

    public String getCensus_tract() {
        return census_tract;
    }

    public void setCensus_tract(String census_tract) {
        this.census_tract = census_tract;
    }

    public String getBin() {
        return bin;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }

    public String getBbl() {
        return bbl;
    }

    public void setBbl(String bbl) {
        this.bbl = bbl;
    }

    public String getNta() {
        return nta;
    }

    public void setNta(String nta) {
        this.nta = nta;
    }

    public String getBorough() {
        return borough;
    }

    public void setBorough(String borough) {
        this.borough = borough;
    }

    @SerializedName("nta")
    @Expose
    private String nta;
    @SerializedName("borough")
    @Expose
    private String borough;






}
