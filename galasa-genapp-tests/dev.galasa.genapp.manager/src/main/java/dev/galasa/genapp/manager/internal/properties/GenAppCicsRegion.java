/*
 * Licensed Materials - Property of IBM
 * 
 * (c) Copyright IBM Corp. 2020.
 */
package dev.galasa.genapp.manager.internal.properties;

import dev.galasa.framework.spi.ConfigurationPropertyStoreException;
import dev.galasa.framework.spi.cps.CpsProperties;
import dev.galasa.genapp.manager.GenAppManagerException;

import javax.validation.constraints.NotNull;

public class GenAppCicsRegion extends CpsProperties{
    public static String get(@NotNull String instance)
            throws ConfigurationPropertyStoreException, GenAppManagerException {
        return getStringWithDefault(GenAppPropertiesSingleton.cps(), "CICPY01D", "instance", "cics.regionID",instance);
    }
}