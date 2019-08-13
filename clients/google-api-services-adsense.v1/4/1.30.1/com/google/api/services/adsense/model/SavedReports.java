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

package com.google.api.services.adsense.model;

/**
 * Model definition for SavedReports.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the AdSense Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SavedReports extends com.google.api.client.json.GenericJson {

  /**
   * ETag of this response for caching purposes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The saved reports returned in this list response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SavedReport> items;

  static {
    // hack to force ProGuard to consider SavedReport used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(SavedReport.class);
  }

  /**
   * Kind of list this is, in this case adsense#savedReports.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Continuation token used to page through saved reports. To retrieve the next page of results,
   * set the next request's "pageToken" value to this.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * ETag of this response for caching purposes.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * ETag of this response for caching purposes.
   * @param etag etag or {@code null} for none
   */
  public SavedReports setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The saved reports returned in this list response.
   * @return value or {@code null} for none
   */
  public java.util.List<SavedReport> getItems() {
    return items;
  }

  /**
   * The saved reports returned in this list response.
   * @param items items or {@code null} for none
   */
  public SavedReports setItems(java.util.List<SavedReport> items) {
    this.items = items;
    return this;
  }

  /**
   * Kind of list this is, in this case adsense#savedReports.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Kind of list this is, in this case adsense#savedReports.
   * @param kind kind or {@code null} for none
   */
  public SavedReports setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Continuation token used to page through saved reports. To retrieve the next page of results,
   * set the next request's "pageToken" value to this.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Continuation token used to page through saved reports. To retrieve the next page of results,
   * set the next request's "pageToken" value to this.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public SavedReports setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public SavedReports set(String fieldName, Object value) {
    return (SavedReports) super.set(fieldName, value);
  }

  @Override
  public SavedReports clone() {
    return (SavedReports) super.clone();
  }

}
