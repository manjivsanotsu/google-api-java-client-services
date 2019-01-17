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

package com.google.api.services.genomics.model;

/**
 * Model definition for ListCoverageBucketsResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Genomics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListCoverageBucketsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The length of each coverage bucket in base pairs. Note that buckets at the end of a reference
   * sequence may be shorter. This value is omitted if the bucket width is infinity (the default
   * behaviour, with no range or `targetBucketWidth`).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long bucketWidth;

  /**
   * The coverage buckets. The list of buckets is sparse; a bucket with 0 overlapping reads is not
   * returned. A bucket never crosses more than one reference sequence. Each bucket has width
   * `bucketWidth`, unless its end is the end of the reference sequence.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<CoverageBucket> coverageBuckets;

  static {
    // hack to force ProGuard to consider CoverageBucket used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(CoverageBucket.class);
  }

  /**
   * The continuation token, which is used to page through large result sets. Provide this value in
   * a subsequent request to return the next page of results. This field will be empty if there
   * aren't any additional results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The length of each coverage bucket in base pairs. Note that buckets at the end of a reference
   * sequence may be shorter. This value is omitted if the bucket width is infinity (the default
   * behaviour, with no range or `targetBucketWidth`).
   * @return value or {@code null} for none
   */
  public java.lang.Long getBucketWidth() {
    return bucketWidth;
  }

  /**
   * The length of each coverage bucket in base pairs. Note that buckets at the end of a reference
   * sequence may be shorter. This value is omitted if the bucket width is infinity (the default
   * behaviour, with no range or `targetBucketWidth`).
   * @param bucketWidth bucketWidth or {@code null} for none
   */
  public ListCoverageBucketsResponse setBucketWidth(java.lang.Long bucketWidth) {
    this.bucketWidth = bucketWidth;
    return this;
  }

  /**
   * The coverage buckets. The list of buckets is sparse; a bucket with 0 overlapping reads is not
   * returned. A bucket never crosses more than one reference sequence. Each bucket has width
   * `bucketWidth`, unless its end is the end of the reference sequence.
   * @return value or {@code null} for none
   */
  public java.util.List<CoverageBucket> getCoverageBuckets() {
    return coverageBuckets;
  }

  /**
   * The coverage buckets. The list of buckets is sparse; a bucket with 0 overlapping reads is not
   * returned. A bucket never crosses more than one reference sequence. Each bucket has width
   * `bucketWidth`, unless its end is the end of the reference sequence.
   * @param coverageBuckets coverageBuckets or {@code null} for none
   */
  public ListCoverageBucketsResponse setCoverageBuckets(java.util.List<CoverageBucket> coverageBuckets) {
    this.coverageBuckets = coverageBuckets;
    return this;
  }

  /**
   * The continuation token, which is used to page through large result sets. Provide this value in
   * a subsequent request to return the next page of results. This field will be empty if there
   * aren't any additional results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The continuation token, which is used to page through large result sets. Provide this value in
   * a subsequent request to return the next page of results. This field will be empty if there
   * aren't any additional results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListCoverageBucketsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public ListCoverageBucketsResponse set(String fieldName, Object value) {
    return (ListCoverageBucketsResponse) super.set(fieldName, value);
  }

  @Override
  public ListCoverageBucketsResponse clone() {
    return (ListCoverageBucketsResponse) super.clone();
  }

}