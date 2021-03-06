/**
 * BSD 3-Clause License
 *
 * Copyright (c) 2017, GOMOOB All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the
 * following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this list of conditions and the following
 * disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following
 * disclaimer in the documentation and/or other materials provided with the distribution.
 *
 * * Neither the name of the copyright holder nor the names of its contributors may be used to endorse or promote
 * products derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES,
 * INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.gomoob.aws.s3.documentstore;

import java.util.Map;

import com.gomoob.documentstore.IUploadConfig;

/**
 * An Amazon S3 upload configuration.
 *
 * @author Baptiste GAILLARD (baptiste.gaillard@gmail.com)
 */
public class S3UploadConfig implements IUploadConfig {

    /**
     * The Amazon S3 <tt>Cache-Control</tt> metadata to attach to the object to upload.
     */
    private String cacheControl;

    /**
     * The Amazon S3 <tt>Content-Type</tt> metadata to attache to the object to upload.
     */
    private String contentType;

    /**
     * The Amazon S3 metadata to attach to the object to upload.
     */
    private Map<String, String> metadata;

    /**
     * Gets the Amazon S3 <tt>Cache-Control</tt> metadata to attache to the object to upload.
     *
     * @return the Amazon S3 <tt>Cache-Control</tt> metadata to attache to the object to upload.
     */
    public String getCacheControl() {
        return this.cacheControl;
    }

    /**
     * Gets the Amazon S3 <tt>Content-Type</tt> metadata to attache to the object to upload.
     *
     * @return the Amazon S3 <tt>Content-Type</tt> metadata to attache to the object to upload.
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * Gets the Amazon S3 metadata to attach to the object to upload.
     *
     * @return the Amazon S3 metadata to attach to the object to upload.
     */
    public Map<String, String> getMetadata() {
        return this.metadata;
    }

    /**
     * Sets the Amazon S3 <tt>Cache-Control</tt> metadata to attache to the object to upload.
     *
     * @param cacheControl the Amazon S3 <tt>Cache-Control</tt> metadata to attache to the object to upload.
     *
     * @return this instance.
     */
    public S3UploadConfig setCacheControl(final String cacheControl) {
        this.cacheControl = cacheControl;
        return this;
    }

    /**
     * Sets the Amazon S3 <tt>Content-Type</tt> metadata to attache to the object to upload.
     *
     * @param contentType the Amazon S3 <tt>Content-Type</tt> metadata to attache to the object to upload.
     *
     * @return this instance.
     */
    public S3UploadConfig setContentType(final String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Sets the Amazon S3 metadata to attach to the object to upload.
     *
     * @return this instance.
     */
    public S3UploadConfig setMetadata(final Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
}
