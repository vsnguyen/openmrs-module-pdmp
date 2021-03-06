/*
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.pdmp_query;


/**
 * Holds the bag of configuration parameters that we store in the
 * database.  There should be one and only one row in the db, with a
 * PK of 1.  If there are others we'll ignore them.  The PK is useless
 * but Hibernate requires that you have one.
 */
public class Config {

    private int id;
    private String url;
    private String user;
    private String password;


    @SuppressWarnings("unused")
    private Config() {
        this.id = 1;
    }


    public Config(String url, String user, String password) {
        this.id = 1;
        this.url = url;
        this.user = user;
        this.password = password;
    }


    /**
     * The database primary key.  This will always be 1 since there is
     * only one configuration row in the database.
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * The PDMP's web service URL.
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * The user ID used to log into the PDMP.
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    /**
     * The password used to log into the PDMP.
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
