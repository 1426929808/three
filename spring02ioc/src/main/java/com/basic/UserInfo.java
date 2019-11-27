package com.basic;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class UserInfo {
    private Address address;
    private String name;
    private List<Address> addressList;
    private List<String> hobbyList;
    private Set<String> xueli;
    private Map<String,Integer> xuefen;
    private Properties properties;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public List<String> getHobbyList() {
        return hobbyList;
    }

    public void setHobbyList(List<String> hobbyList) {
        this.hobbyList = hobbyList;
    }

    public Set<String> getXueli() {
        return xueli;
    }

    public void setXueli(Set<String> xueli) {
        this.xueli = xueli;
    }

    public Map<String, Integer> getXuefen() {
        return xuefen;
    }

    public void setXuefen(Map<String, Integer> xuefen) {
        this.xuefen = xuefen;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "address=" + address +
                ", name='" + name + '\'' +
                ", addressList=" + addressList +
                ", hobbyList=" + hobbyList +
                ", xueli=" + xueli +
                ", xuefen=" + xuefen +
                ", properties=" + properties +
                '}';
    }
}
