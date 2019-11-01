/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.pinpoint.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpoint.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * JourneyDateRangeKpiResponseMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class JourneyDateRangeKpiResponseMarshaller {

    private static final MarshallingInfo<String> APPLICATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApplicationId").build();
    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> JOURNEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("JourneyId").build();
    private static final MarshallingInfo<String> KPINAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KpiName").build();
    private static final MarshallingInfo<StructuredPojo> KPIRESULT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KpiResult").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartTime").timestampFormat("iso8601").build();

    private static final JourneyDateRangeKpiResponseMarshaller instance = new JourneyDateRangeKpiResponseMarshaller();

    public static JourneyDateRangeKpiResponseMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(JourneyDateRangeKpiResponse journeyDateRangeKpiResponse, ProtocolMarshaller protocolMarshaller) {

        if (journeyDateRangeKpiResponse == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(journeyDateRangeKpiResponse.getApplicationId(), APPLICATIONID_BINDING);
            protocolMarshaller.marshall(journeyDateRangeKpiResponse.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(journeyDateRangeKpiResponse.getJourneyId(), JOURNEYID_BINDING);
            protocolMarshaller.marshall(journeyDateRangeKpiResponse.getKpiName(), KPINAME_BINDING);
            protocolMarshaller.marshall(journeyDateRangeKpiResponse.getKpiResult(), KPIRESULT_BINDING);
            protocolMarshaller.marshall(journeyDateRangeKpiResponse.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(journeyDateRangeKpiResponse.getStartTime(), STARTTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
