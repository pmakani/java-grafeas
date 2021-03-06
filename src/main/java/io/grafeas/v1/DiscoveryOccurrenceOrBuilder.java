/*
 * Copyright 2019 The Grafeas Authors. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grafeas/v1/discovery.proto

package io.grafeas.v1;

public interface DiscoveryOccurrenceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1.DiscoveryOccurrence)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Whether the resource is continuously analyzed.
   * </pre>
   *
   * <code>.grafeas.v1.DiscoveryOccurrence.ContinuousAnalysis continuous_analysis = 1;</code>
   *
   * @return The enum numeric value on the wire for continuousAnalysis.
   */
  int getContinuousAnalysisValue();
  /**
   *
   *
   * <pre>
   * Whether the resource is continuously analyzed.
   * </pre>
   *
   * <code>.grafeas.v1.DiscoveryOccurrence.ContinuousAnalysis continuous_analysis = 1;</code>
   *
   * @return The continuousAnalysis.
   */
  io.grafeas.v1.DiscoveryOccurrence.ContinuousAnalysis getContinuousAnalysis();

  /**
   *
   *
   * <pre>
   * The status of discovery for the resource.
   * </pre>
   *
   * <code>.grafeas.v1.DiscoveryOccurrence.AnalysisStatus analysis_status = 2;</code>
   *
   * @return The enum numeric value on the wire for analysisStatus.
   */
  int getAnalysisStatusValue();
  /**
   *
   *
   * <pre>
   * The status of discovery for the resource.
   * </pre>
   *
   * <code>.grafeas.v1.DiscoveryOccurrence.AnalysisStatus analysis_status = 2;</code>
   *
   * @return The analysisStatus.
   */
  io.grafeas.v1.DiscoveryOccurrence.AnalysisStatus getAnalysisStatus();

  /**
   *
   *
   * <pre>
   * When an error is encountered this will contain a LocalizedMessage under
   * details to show to the user. The LocalizedMessage is output only and
   * populated by the API.
   * </pre>
   *
   * <code>.google.rpc.Status analysis_status_error = 3;</code>
   *
   * @return Whether the analysisStatusError field is set.
   */
  boolean hasAnalysisStatusError();
  /**
   *
   *
   * <pre>
   * When an error is encountered this will contain a LocalizedMessage under
   * details to show to the user. The LocalizedMessage is output only and
   * populated by the API.
   * </pre>
   *
   * <code>.google.rpc.Status analysis_status_error = 3;</code>
   *
   * @return The analysisStatusError.
   */
  com.google.rpc.Status getAnalysisStatusError();
  /**
   *
   *
   * <pre>
   * When an error is encountered this will contain a LocalizedMessage under
   * details to show to the user. The LocalizedMessage is output only and
   * populated by the API.
   * </pre>
   *
   * <code>.google.rpc.Status analysis_status_error = 3;</code>
   */
  com.google.rpc.StatusOrBuilder getAnalysisStatusErrorOrBuilder();
}
