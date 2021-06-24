package com.gcit.training;

import java.security.Permission;

public class TestingSecurityManager extends SecurityManager {
    @Override
    public void checkPermission(Permission perm) {
        // Allow everything.
    }

    @Override
    public void checkPermission(Permission perm, Object context) {
        // Allow everything.
    }

    @Override
    public void checkExit(int status) {
        super.checkExit(status);
        throw new TestExitException(status);
    }

    public static class TestExitException extends RuntimeException {
        private final int status;

        public TestExitException(int status) {
            this.status = status;
        }

        public int getStatus() {
            return status;
        }
    }
}
