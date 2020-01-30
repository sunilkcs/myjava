package com.natwest.model;

public enum IcbPimsProxyAction {

    POLL_PAYMENT ("POLL_PAYMENT"),
    REGISTER_PAYMENT ("REGISTER_PAYMENT"),
    VALIDATE_PAYMENT ("VALIDATE_PAYMENT");


    private String value;

    IcbPimsProxyAction(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static IcbPimsProxyAction fromValue(String text) {
        for (IcbPimsProxyAction b : IcbPimsProxyAction.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }


}