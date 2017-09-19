/*
 * coner-core-service
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.1.11
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.coner.core.client.api;

import org.coner.core.client.ApiCallback;
import org.coner.core.client.ApiClient;
import org.coner.core.client.ApiException;
import org.coner.core.client.ApiResponse;
import org.coner.core.client.Configuration;
import org.coner.core.client.Pair;
import org.coner.core.client.ProgressRequestBody;
import org.coner.core.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.coner.core.client.model.AddRawTimeToFirstRunLackingRequest;
import org.coner.core.client.model.AddRunRequest;
import org.coner.core.client.model.ErrorMessage;
import org.coner.core.client.model.GetEventRunsResponse;
import org.coner.core.client.model.RunApiEntity;
import org.coner.core.client.model.ValidationErrorMessage;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RunsApi {
    private ApiClient apiClient;

    public RunsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RunsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for addRawTimeToFirstRunInSequenceLackingOne */
    private com.squareup.okhttp.Call addRawTimeToFirstRunInSequenceLackingOneCall(String eventId, AddRawTimeToFirstRunLackingRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/events/{eventId}/runs/rawTimes".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "eventId" + "\\}", apiClient.escapeString(eventId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call addRawTimeToFirstRunInSequenceLackingOneValidateBeforeCall(String eventId, AddRawTimeToFirstRunLackingRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'eventId' is set
        if (eventId == null) {
            throw new ApiException("Missing the required parameter 'eventId' when calling addRawTimeToFirstRunInSequenceLackingOne(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling addRawTimeToFirstRunInSequenceLackingOne(Async)");
        }
        
        
        com.squareup.okhttp.Call call = addRawTimeToFirstRunInSequenceLackingOneCall(eventId, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Add a raw time to the first run in sequence lacking one, or to a new run created on-the-fly if no runs lack a raw time
     * 
     * @param eventId Event ID (required)
     * @param body Time (required)
     * @return RunApiEntity
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RunApiEntity addRawTimeToFirstRunInSequenceLackingOne(String eventId, AddRawTimeToFirstRunLackingRequest body) throws ApiException {
        ApiResponse<RunApiEntity> resp = addRawTimeToFirstRunInSequenceLackingOneWithHttpInfo(eventId, body);
        return resp.getData();
    }

    /**
     * Add a raw time to the first run in sequence lacking one, or to a new run created on-the-fly if no runs lack a raw time
     * 
     * @param eventId Event ID (required)
     * @param body Time (required)
     * @return ApiResponse&lt;RunApiEntity&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RunApiEntity> addRawTimeToFirstRunInSequenceLackingOneWithHttpInfo(String eventId, AddRawTimeToFirstRunLackingRequest body) throws ApiException {
        com.squareup.okhttp.Call call = addRawTimeToFirstRunInSequenceLackingOneValidateBeforeCall(eventId, body, null, null);
        Type localVarReturnType = new TypeToken<RunApiEntity>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add a raw time to the first run in sequence lacking one, or to a new run created on-the-fly if no runs lack a raw time (asynchronously)
     * 
     * @param eventId Event ID (required)
     * @param body Time (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addRawTimeToFirstRunInSequenceLackingOneAsync(String eventId, AddRawTimeToFirstRunLackingRequest body, final ApiCallback<RunApiEntity> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = addRawTimeToFirstRunInSequenceLackingOneValidateBeforeCall(eventId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RunApiEntity>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for addRun */
    private com.squareup.okhttp.Call addRunCall(String eventId, AddRunRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/events/{eventId}/runs".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "eventId" + "\\}", apiClient.escapeString(eventId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call addRunValidateBeforeCall(String eventId, AddRunRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'eventId' is set
        if (eventId == null) {
            throw new ApiException("Missing the required parameter 'eventId' when calling addRun(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling addRun(Async)");
        }
        
        
        com.squareup.okhttp.Call call = addRunCall(eventId, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Add a new run
     * 
     * @param eventId Event ID (required)
     * @param body Run (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void addRun(String eventId, AddRunRequest body) throws ApiException {
        addRunWithHttpInfo(eventId, body);
    }

    /**
     * Add a new run
     * 
     * @param eventId Event ID (required)
     * @param body Run (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> addRunWithHttpInfo(String eventId, AddRunRequest body) throws ApiException {
        com.squareup.okhttp.Call call = addRunValidateBeforeCall(eventId, body, null, null);
        return apiClient.execute(call);
    }

    /**
     * Add a new run (asynchronously)
     * 
     * @param eventId Event ID (required)
     * @param body Run (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addRunAsync(String eventId, AddRunRequest body, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = addRunValidateBeforeCall(eventId, body, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for getEventRuns */
    private com.squareup.okhttp.Call getEventRunsCall(String eventId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/events/{eventId}/runs".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "eventId" + "\\}", apiClient.escapeString(eventId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getEventRunsValidateBeforeCall(String eventId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'eventId' is set
        if (eventId == null) {
            throw new ApiException("Missing the required parameter 'eventId' when calling getEventRuns(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getEventRunsCall(eventId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get a list of all runs at an event
     * 
     * @param eventId Event ID (required)
     * @return GetEventRunsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetEventRunsResponse getEventRuns(String eventId) throws ApiException {
        ApiResponse<GetEventRunsResponse> resp = getEventRunsWithHttpInfo(eventId);
        return resp.getData();
    }

    /**
     * Get a list of all runs at an event
     * 
     * @param eventId Event ID (required)
     * @return ApiResponse&lt;GetEventRunsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetEventRunsResponse> getEventRunsWithHttpInfo(String eventId) throws ApiException {
        com.squareup.okhttp.Call call = getEventRunsValidateBeforeCall(eventId, null, null);
        Type localVarReturnType = new TypeToken<GetEventRunsResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a list of all runs at an event (asynchronously)
     * 
     * @param eventId Event ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEventRunsAsync(String eventId, final ApiCallback<GetEventRunsResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getEventRunsValidateBeforeCall(eventId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetEventRunsResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getRun */
    private com.squareup.okhttp.Call getRunCall(String eventId, String runId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/events/{eventId}/runs/{runId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "eventId" + "\\}", apiClient.escapeString(eventId.toString()))
        .replaceAll("\\{" + "runId" + "\\}", apiClient.escapeString(runId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getRunValidateBeforeCall(String eventId, String runId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'eventId' is set
        if (eventId == null) {
            throw new ApiException("Missing the required parameter 'eventId' when calling getRun(Async)");
        }
        
        // verify the required parameter 'runId' is set
        if (runId == null) {
            throw new ApiException("Missing the required parameter 'runId' when calling getRun(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getRunCall(eventId, runId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get a specific run
     * 
     * @param eventId Event ID (required)
     * @param runId Run ID (required)
     * @return RunApiEntity
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RunApiEntity getRun(String eventId, String runId) throws ApiException {
        ApiResponse<RunApiEntity> resp = getRunWithHttpInfo(eventId, runId);
        return resp.getData();
    }

    /**
     * Get a specific run
     * 
     * @param eventId Event ID (required)
     * @param runId Run ID (required)
     * @return ApiResponse&lt;RunApiEntity&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RunApiEntity> getRunWithHttpInfo(String eventId, String runId) throws ApiException {
        com.squareup.okhttp.Call call = getRunValidateBeforeCall(eventId, runId, null, null);
        Type localVarReturnType = new TypeToken<RunApiEntity>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a specific run (asynchronously)
     * 
     * @param eventId Event ID (required)
     * @param runId Run ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getRunAsync(String eventId, String runId, final ApiCallback<RunApiEntity> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getRunValidateBeforeCall(eventId, runId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RunApiEntity>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
