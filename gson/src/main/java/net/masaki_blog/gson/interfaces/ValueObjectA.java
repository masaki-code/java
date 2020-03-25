package net.masaki_blog.gson.interfaces;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ValueObjectA implements IValueObject {

    private String value;

    @Override
    public String getValue() {
        return this.value;
    }

}
