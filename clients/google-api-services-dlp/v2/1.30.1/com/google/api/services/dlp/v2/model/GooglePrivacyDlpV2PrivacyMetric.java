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

package com.google.api.services.dlp.v2.model;

/**
 * Privacy metric to compute for reidentification risk analysis.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Data Loss Prevention (DLP) API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePrivacyDlpV2PrivacyMetric extends com.google.api.client.json.GenericJson {

  /**
   * Categorical stats
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2CategoricalStatsConfig categoricalStatsConfig;

  /**
   * delta-presence
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2DeltaPresenceEstimationConfig deltaPresenceEstimationConfig;

  /**
   * K-anonymity
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2KAnonymityConfig kAnonymityConfig;

  /**
   * k-map
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2KMapEstimationConfig kMapEstimationConfig;

  /**
   * l-diversity
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2LDiversityConfig lDiversityConfig;

  /**
   * Numerical stats
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2NumericalStatsConfig numericalStatsConfig;

  /**
   * Categorical stats
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2CategoricalStatsConfig getCategoricalStatsConfig() {
    return categoricalStatsConfig;
  }

  /**
   * Categorical stats
   * @param categoricalStatsConfig categoricalStatsConfig or {@code null} for none
   */
  public GooglePrivacyDlpV2PrivacyMetric setCategoricalStatsConfig(GooglePrivacyDlpV2CategoricalStatsConfig categoricalStatsConfig) {
    this.categoricalStatsConfig = categoricalStatsConfig;
    return this;
  }

  /**
   * delta-presence
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2DeltaPresenceEstimationConfig getDeltaPresenceEstimationConfig() {
    return deltaPresenceEstimationConfig;
  }

  /**
   * delta-presence
   * @param deltaPresenceEstimationConfig deltaPresenceEstimationConfig or {@code null} for none
   */
  public GooglePrivacyDlpV2PrivacyMetric setDeltaPresenceEstimationConfig(GooglePrivacyDlpV2DeltaPresenceEstimationConfig deltaPresenceEstimationConfig) {
    this.deltaPresenceEstimationConfig = deltaPresenceEstimationConfig;
    return this;
  }

  /**
   * K-anonymity
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2KAnonymityConfig getKAnonymityConfig() {
    return kAnonymityConfig;
  }

  /**
   * K-anonymity
   * @param kAnonymityConfig kAnonymityConfig or {@code null} for none
   */
  public GooglePrivacyDlpV2PrivacyMetric setKAnonymityConfig(GooglePrivacyDlpV2KAnonymityConfig kAnonymityConfig) {
    this.kAnonymityConfig = kAnonymityConfig;
    return this;
  }

  /**
   * k-map
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2KMapEstimationConfig getKMapEstimationConfig() {
    return kMapEstimationConfig;
  }

  /**
   * k-map
   * @param kMapEstimationConfig kMapEstimationConfig or {@code null} for none
   */
  public GooglePrivacyDlpV2PrivacyMetric setKMapEstimationConfig(GooglePrivacyDlpV2KMapEstimationConfig kMapEstimationConfig) {
    this.kMapEstimationConfig = kMapEstimationConfig;
    return this;
  }

  /**
   * l-diversity
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2LDiversityConfig getLDiversityConfig() {
    return lDiversityConfig;
  }

  /**
   * l-diversity
   * @param lDiversityConfig lDiversityConfig or {@code null} for none
   */
  public GooglePrivacyDlpV2PrivacyMetric setLDiversityConfig(GooglePrivacyDlpV2LDiversityConfig lDiversityConfig) {
    this.lDiversityConfig = lDiversityConfig;
    return this;
  }

  /**
   * Numerical stats
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2NumericalStatsConfig getNumericalStatsConfig() {
    return numericalStatsConfig;
  }

  /**
   * Numerical stats
   * @param numericalStatsConfig numericalStatsConfig or {@code null} for none
   */
  public GooglePrivacyDlpV2PrivacyMetric setNumericalStatsConfig(GooglePrivacyDlpV2NumericalStatsConfig numericalStatsConfig) {
    this.numericalStatsConfig = numericalStatsConfig;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2PrivacyMetric set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2PrivacyMetric) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2PrivacyMetric clone() {
    return (GooglePrivacyDlpV2PrivacyMetric) super.clone();
  }

}
