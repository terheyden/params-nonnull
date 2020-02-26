/**
 * Tried: @DefaultAnnotation(Nonnull.class)
 * But it doesn't work in IntelliJ - maybe in the Findbugs plugin.
 *
 * Tried: @ParametersAreNonnullByDefault
 * It works in IntelliJ.
 *
 * Wrote my own. See:
 * https://stackoverflow.com/questions/13310994/set-findbugs-notnull-as-default-for-all-classes-under-a-package
 */

@NonnullByDefault
package com.terheyden.params;
