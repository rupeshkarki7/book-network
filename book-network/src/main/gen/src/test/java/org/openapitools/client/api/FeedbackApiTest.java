/*
 * OpenApi Specification - XXMORTIS
 * OpenApi documentation for Spring security
 *
 * The version of the OpenAPI document: 1.0
 * Contact: rpshkarki@gmail.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.FeedbackRequest;
import org.openapitools.client.model.PageResponseFeedbackResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FeedbackApi
 */
@Disabled
public class FeedbackApiTest {

    private final FeedbackApi api = new FeedbackApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findAllFeedbackByBookTest() throws ApiException {
        Integer bookId = null;
        Integer page = null;
        Integer size = null;
        PageResponseFeedbackResponse response = api.findAllFeedbackByBook(bookId, page, size);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void saveFeedbackTest() throws ApiException {
        FeedbackRequest feedbackRequest = null;
        Integer response = api.saveFeedback(feedbackRequest);
        // TODO: test validations
    }

}