/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.transfer;

public interface ProgressReporter {
    /**
     * Notification to indicate that progress was made during an upload operation.
     *
     * Note that the {@code completed} value may decrease from one invocation to the next if any part
     * of the upload to to be retried.
     *
     * @param completed The number of bytes that have been already been uploaded for this operation.
     * @param total The total number of bytes to upload for this operation.
     */
    void onProgress(final long completed, final long total);
}
