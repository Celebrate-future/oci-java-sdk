/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.io.internal;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import com.oracle.bmc.io.DuplicatableInputStream;

/**
 * Basic extension to {@link ByteArrayInputStream} that lets you create duplicate
 * streams from the same underlying byte buffer.
 */
public class WrappedByteArrayInputStream extends ByteArrayInputStream
        implements DuplicatableInputStream {

    /**
     * Create a new stream from the given buffer.
     * @param buf The byte buffer.
     */
    public WrappedByteArrayInputStream(byte[] buf) {
        super(buf);
    }

    /**
     * Create a new stream from the given buffer.
     * @param buf      The byte buffer.
     * @param offset   The offset in the buffer of the first byte to read.
     * @param length   The maximum number of bytes to read from the buffer.
     */
    public WrappedByteArrayInputStream(byte[] buf, int offset, int length) {
        super(buf, offset, length);
    }

    /**
     * Returns the length of the underlying buffer (ie, the length of this stream).
     *
     * @return The length of the underlying buffer.
     */
    public long length() {
        return buf.length;
    }

    @Override
    public InputStream duplicate() {
        return new WrappedByteArrayInputStream(this.buf);
    }
}
