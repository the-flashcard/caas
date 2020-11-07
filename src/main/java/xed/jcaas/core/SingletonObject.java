/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xed.jcaas.core;

import xed.jcaas.common.Settings;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 *
 * @author zkidkid
 * 
 */
public abstract class SingletonObject{
    protected Settings _settings;
    public SingletonObject(Settings settings){
        _settings = settings;
    }   

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
    
    
}
