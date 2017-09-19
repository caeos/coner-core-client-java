/*
 * coner-core-service
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.1.12
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.coner.core.client.api;

import org.coner.core.client.ApiException;
import org.coner.core.client.model.AddHandicapGroupRequest;
import org.coner.core.client.model.AddHandicapGroupSetRequest;
import org.coner.core.client.model.ErrorMessage;
import org.coner.core.client.model.GetHandicapGroupSetsResponse;
import org.coner.core.client.model.GetHandicapGroupsResponse;
import org.coner.core.client.model.HandicapGroupApiEntity;
import org.coner.core.client.model.HandicapGroupSetApiEntity;
import org.coner.core.client.model.ValidationErrorMessage;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for HandicapGroupsApi
 */
@Ignore
public class HandicapGroupsApiTest {

    private final HandicapGroupsApi api = new HandicapGroupsApi();

    
    /**
     * Add a new Handicap Group Set
     *
     * Optionally include a set of Handicap Group entities with ID to associate them
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addTest() throws ApiException {
        AddHandicapGroupSetRequest body = null;
        api.add(body);

        // TODO: test validations
    }
    
    /**
     * Add a Handicap Group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addHandicapGroupTest() throws ApiException {
        AddHandicapGroupRequest body = null;
        api.addHandicapGroup(body);

        // TODO: test validations
    }
    
    /**
     * Add a Handicap Group to a Handicap Group Set
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addHandicapGroupToHandicapGroupSetTest() throws ApiException {
        String handicapGroupSetId = null;
        String handicapGroupId = null;
        HandicapGroupSetApiEntity response = api.addHandicapGroupToHandicapGroupSet(handicapGroupSetId, handicapGroupId);

        // TODO: test validations
    }
    
    /**
     * Get a Handicap Group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHandicapGroupTest() throws ApiException {
        String handicapGroupId = null;
        HandicapGroupApiEntity response = api.getHandicapGroup(handicapGroupId);

        // TODO: test validations
    }
    
    /**
     * Get a Handicap Group Set
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHandicapGroupSetTest() throws ApiException {
        String handicapGroupSetId = null;
        HandicapGroupSetApiEntity response = api.getHandicapGroupSet(handicapGroupSetId);

        // TODO: test validations
    }
    
    /**
     * Get all Handicap Group Sets
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHandicapGroupSetsTest() throws ApiException {
        GetHandicapGroupSetsResponse response = api.getHandicapGroupSets();

        // TODO: test validations
    }
    
    /**
     * Get all Handicap Groups
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHandicapGroupsTest() throws ApiException {
        GetHandicapGroupsResponse response = api.getHandicapGroups();

        // TODO: test validations
    }
    
}
