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

package com.google.api.services.jobs.v3.model;

/**
 * Output only.
 *
 * The List companies response object.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Talent Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListCompaniesResponse extends com.google.api.client.json.GenericJson {

  /**
   * Companies for the current client.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Company> companies;

  static {
    // hack to force ProGuard to consider Company used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Company.class);
  }

  /**
   * Additional information for the API invocation, such as the request tracking id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ResponseMetadata metadata;

  /**
   * A token to retrieve the next page of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Companies for the current client.
   * @return value or {@code null} for none
   */
  public java.util.List<Company> getCompanies() {
    return companies;
  }

  /**
   * Companies for the current client.
   * @param companies companies or {@code null} for none
   */
  public ListCompaniesResponse setCompanies(java.util.List<Company> companies) {
    this.companies = companies;
    return this;
  }

  /**
   * Additional information for the API invocation, such as the request tracking id.
   * @return value or {@code null} for none
   */
  public ResponseMetadata getMetadata() {
    return metadata;
  }

  /**
   * Additional information for the API invocation, such as the request tracking id.
   * @param metadata metadata or {@code null} for none
   */
  public ListCompaniesResponse setMetadata(ResponseMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * A token to retrieve the next page of results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token to retrieve the next page of results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListCompaniesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public ListCompaniesResponse set(String fieldName, Object value) {
    return (ListCompaniesResponse) super.set(fieldName, value);
  }

  @Override
  public ListCompaniesResponse clone() {
    return (ListCompaniesResponse) super.clone();
  }

}
