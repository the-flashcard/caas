/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xed.jcaas.common;

/**
 *
 * @author zkidkid Settings is usually use as a configuration option.
 */
public interface Settings {

    String get(String key);

    long getAsLong(String key, long defaultVal);

    int getAsInteger(String key, int defaultVal);

    double getAsDouble(String key, double defaultVal);

    String[] getAsList(String key, String delimiter, String[] defaultVal);

}
