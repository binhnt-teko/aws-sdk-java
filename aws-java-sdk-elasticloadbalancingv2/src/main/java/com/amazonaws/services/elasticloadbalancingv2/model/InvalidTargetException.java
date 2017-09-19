/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticloadbalancingv2.model;

import javax.annotation.Generated;

/**
 * <p>
 * The specified target does not exist or is not in the same VPC as the target group.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidTargetException extends com.amazonaws.services.elasticloadbalancingv2.model.AmazonElasticLoadBalancingException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new InvalidTargetException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidTargetException(String message) {
        super(message);
    }

}