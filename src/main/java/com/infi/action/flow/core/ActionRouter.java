/*
 * Copyright 2014-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.infi.action.flow.core;

import com.infi.action.flow.model.ExecutionResult;

/**
 * @author hongtao
 * @version v 0.1 , 2018年1月5日 下午4:58:58
 * @since JDK 1.8
 */
@FunctionalInterface
public interface ActionRouter {

  /**
   * 
   * @param executionResult
   * @return
   */
  public StepKey route(ExecutionResult executionResult);

  /**
   * Throw exception or redirect to other step key.
   * 
   * @param executionResult
   * @param e
   * @return
   * @throws Exception
   */
  default StepKey exceptionCaught(ExecutionResult executionResult, Exception e) throws Exception {
    throw e;
  }
}