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
package com.amazonaws.services.logs.model.transform;

import java.util.Map;
import java.util.Map.Entry;
import java.math.*;
import java.nio.ByteBuffer;

import com.amazonaws.services.logs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ExportTask JSON Unmarshaller
 */
public class ExportTaskJsonUnmarshaller implements
        Unmarshaller<ExportTask, JsonUnmarshallerContext> {

    public ExportTask unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        ExportTask exportTask = new ExportTask();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("taskId", targetDepth)) {
                    context.nextToken();
                    exportTask.setTaskId(context.getUnmarshaller(String.class)
                            .unmarshall(context));
                }
                if (context.testExpression("taskName", targetDepth)) {
                    context.nextToken();
                    exportTask.setTaskName(context
                            .getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("logGroupName", targetDepth)) {
                    context.nextToken();
                    exportTask.setLogGroupName(context.getUnmarshaller(
                            String.class).unmarshall(context));
                }
                if (context.testExpression("from", targetDepth)) {
                    context.nextToken();
                    exportTask.setFrom(context.getUnmarshaller(Long.class)
                            .unmarshall(context));
                }
                if (context.testExpression("to", targetDepth)) {
                    context.nextToken();
                    exportTask.setTo(context.getUnmarshaller(Long.class)
                            .unmarshall(context));
                }
                if (context.testExpression("destination", targetDepth)) {
                    context.nextToken();
                    exportTask.setDestination(context.getUnmarshaller(
                            String.class).unmarshall(context));
                }
                if (context.testExpression("destinationPrefix", targetDepth)) {
                    context.nextToken();
                    exportTask.setDestinationPrefix(context.getUnmarshaller(
                            String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    exportTask.setStatus(ExportTaskStatusJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("executionInfo", targetDepth)) {
                    context.nextToken();
                    exportTask
                            .setExecutionInfo(ExportTaskExecutionInfoJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null
                        || context.getLastParsedParentElement().equals(
                                currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return exportTask;
    }

    private static ExportTaskJsonUnmarshaller instance;

    public static ExportTaskJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ExportTaskJsonUnmarshaller();
        return instance;
    }
}