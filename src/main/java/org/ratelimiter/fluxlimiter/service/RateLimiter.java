package org.ratelimiter.fluxlimiter.service;

import org.ratelimiter.fluxlimiter.model.CheckResponse;
import org.ratelimiter.fluxlimiter.model.TenantConfig;

public interface RateLimiter {
    CheckResponse check(String key, TenantConfig config);
}
