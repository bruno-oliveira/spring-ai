/*
 * Copyright 2023-2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.ai.model;

/**
 * This interface provides methods to access the main output of the AI model and the
 * metadata associated with this result. It is designed to offer a standardized and
 * comprehensive way to handle and interpret the outputs generated by AI models, catering
 * to diverse AI applications and use cases.
 *
 * @param <T> the type of the output generated by the AI model
 * @author Mark Pollack
 * @since 0.8.0
 */
public interface ModelResult<T> {

	/**
	 * Retrieves the output generated by the AI model.
	 * @return the output generated by the AI model
	 */
	T getOutput();

	/**
	 * Retrieves the metadata associated with the result of an AI model.
	 * @return the metadata associated with the result
	 */
	ResultMetadata getMetadata();

}
