/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * DetachVolumeRequest Marshaller
 */

public class DetachVolumeRequestMarshaller implements
        Marshaller<Request<DetachVolumeRequest>, DetachVolumeRequest> {

    public Request<DetachVolumeRequest> marshall(
            DetachVolumeRequest detachVolumeRequest) {

        if (detachVolumeRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DetachVolumeRequest> request = new DefaultRequest<DetachVolumeRequest>(
                detachVolumeRequest, "AmazonEC2");
        request.addParameter("Action", "DetachVolume");
        request.addParameter("Version", "2016-04-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (detachVolumeRequest.getVolumeId() != null) {
            request.addParameter("VolumeId",
                    StringUtils.fromString(detachVolumeRequest.getVolumeId()));
        }

        if (detachVolumeRequest.getInstanceId() != null) {
            request.addParameter("InstanceId",
                    StringUtils.fromString(detachVolumeRequest.getInstanceId()));
        }

        if (detachVolumeRequest.getDevice() != null) {
            request.addParameter("Device",
                    StringUtils.fromString(detachVolumeRequest.getDevice()));
        }

        if (detachVolumeRequest.getForce() != null) {
            request.addParameter("Force",
                    StringUtils.fromBoolean(detachVolumeRequest.getForce()));
        }

        return request;
    }

}