package org.pac4j.core.credentials.authenticator;

import org.pac4j.core.context.WebContext;
import org.pac4j.core.credentials.Credentials;
import org.pac4j.core.exception.CredentialsException;

/**
 * An authenticator is responsible for validating {@link Credentials} and should throw a {@link CredentialsException}
 * if the authentication fails.
 *
 * @author Jerome Leleu
 * @since 1.7.0
 */
public interface Authenticator<C extends Credentials> {

    /**
     * Validate the credentials. It should throw a {@link CredentialsException} in case of failure.
     *
     * @param credentials the given credentials
     * @param context the web context
     */
    void validate(C credentials, WebContext context);
}
