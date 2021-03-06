/*
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
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.homegraph.v1.model;

/**
 * Request type for the [`Sync`](#google.home.graph.v1.HomeGraphApiService.Sync) call. This should
 * follow the same format as the Actions on Google `action.devices.SYNC`
 * [request](/actions/smarthome/create-app#actiondevicessync) with the exception of the extra
 * `agent_user_id` and no `intent` field.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the HomeGraph API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SyncRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. Third-party user ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String agentUserId;

  /**
   * Request ID used for debugging.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String requestId;

  /**
   * Required. Third-party user ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getAgentUserId() {
    return agentUserId;
  }

  /**
   * Required. Third-party user ID.
   * @param agentUserId agentUserId or {@code null} for none
   */
  public SyncRequest setAgentUserId(java.lang.String agentUserId) {
    this.agentUserId = agentUserId;
    return this;
  }

  /**
   * Request ID used for debugging.
   * @return value or {@code null} for none
   */
  public java.lang.String getRequestId() {
    return requestId;
  }

  /**
   * Request ID used for debugging.
   * @param requestId requestId or {@code null} for none
   */
  public SyncRequest setRequestId(java.lang.String requestId) {
    this.requestId = requestId;
    return this;
  }

  @Override
  public SyncRequest set(String fieldName, Object value) {
    return (SyncRequest) super.set(fieldName, value);
  }

  @Override
  public SyncRequest clone() {
    return (SyncRequest) super.clone();
  }

}
