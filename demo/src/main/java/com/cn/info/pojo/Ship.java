package com.cn.info.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by GH on 2017/5/10.
 */
public class Ship implements Serializable {
    private String  indexs;   //船舶编号
    private String type; //船舶类型
    private String port; //船籍港
    private String level;//船级
    private String district;  //船区
    private double length;  //长度
    private double width;  //型宽
    private double height;  //型深
    private double grosston;  //总吨
    private double deadweight;   //载重吨
    private String enginetype;  //主机型号
    private double enginepower;   //主机功率
    private String builddate;  //建成日期
    private String factory;  //建造船厂
    private String dealdate;  //成交日期


    public Ship(){}

    public Ship( String indexs, String type, String port, String level, String district, double length, double width, double height, double grosston, double deadweight, String enginetype, double enginepower, String builddate, String factory, String dealdate) {

        this.indexs = indexs;
        this.type = type;
        this.port = port;
        this.level = level;
        this.district = district;
        this.length = length;
        this.width = width;
        this.height = height;
        this.grosston = grosston;
        this.deadweight = deadweight;
        this.enginetype = enginetype;
        this.enginepower = enginepower;
        this.builddate = builddate;
        this.factory = factory;
        this.dealdate = dealdate;
    }


    public String getIndex() {
        return indexs;
    }

    public void setIndex(String indexs) {
        this.indexs = indexs;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getDitrict() {
        return district;
    }

    public void setDitrict(String district) {
        this.district = district;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getGrosston() {
        return grosston;
    }

    public void setGrosston(double grosston) {
        this.grosston = grosston;
    }

    public double getDeadweight() {
        return deadweight;
    }

    public void setDeadweight(double deadweight) {
        this.deadweight = deadweight;
    }

    public String getEnginetype() {
        return enginetype;
    }

    public void setEnginetype(String enginetype) {
        this.enginetype = enginetype;
    }

    public double getEnginepower() {
        return enginepower;
    }

    public void setEnginepower(double enginepower) {
        this.enginepower = enginepower;
    }

    public String getBuilddate() {
        return builddate;
    }

    public void setBuilddate(String builddate) {
        this.builddate = builddate;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public String getDealdate() {
        return dealdate;
    }

    public void setDealdate(String dealdate) {
        this.dealdate = dealdate;
    }


    @Override
    public String toString() {
        return "Ship{" +
                ", index='" + indexs + '\'' +
                ", type='" + type + '\'' +
                ", port='" + port + '\'' +
                ", level='" + level + '\'' +
                ", district='" + district + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", grosston=" + grosston +
                ", deadweight=" + deadweight +
                ", enginetype='" + enginetype + '\'' +
                ", enginepower=" + enginepower +
                ", builddate='" + builddate + '\'' +
                ", factory='" + factory + '\'' +
                ", dealdate='" + dealdate + '\'' +
                '}';
    }
}
