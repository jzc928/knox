/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.gateway.descriptor.impl;

import org.apache.hadoop.gateway.descriptor.ClusterDescriptor;
import org.apache.hadoop.gateway.descriptor.ClusterParamDescriptor;

public class ClusterParamDescriptorImpl implements ClusterParamDescriptor {

  private ClusterDescriptor parent;
  private String name;
  private String value;

  ClusterParamDescriptorImpl( ClusterDescriptor parent ) {
    this.parent = parent;
  }

  @Override
  public void up( ClusterDescriptor parent ) {
    this.parent = parent;
  }

  @Override
  public ClusterDescriptor up() {
    return parent;
  }

  @Override
  public ClusterParamDescriptor name( String name ) {
    this.name = name;
    return this;
  }

  @Override
  public String name() {
    return name;
  }

  @Override
  public ClusterParamDescriptor value( String value ) {
    this.value = value;
    return this;
  }

  @Override
  public String value() {
    return value;
  }
}
