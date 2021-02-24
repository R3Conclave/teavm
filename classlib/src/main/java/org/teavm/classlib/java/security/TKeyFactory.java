/*
 *  Copyright 2021 R3 Ltd.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.teavm.classlib.java.security;

import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

public class TKeyFactory {
    private final String algorithm;

    protected TKeyFactory(KeyFactorySpi keyFacSpi, Provider provider, String algorithm) {
        this.algorithm =  algorithm;
    }

    private TKeyFactory(String algorithm) throws TNoSuchAlgorithmException {
        this.algorithm = algorithm;
        throw new TNoSuchAlgorithmException("KeyFactory for " + algorithm + " is unimplemented");
    }

    public static TKeyFactory getInstance(String algorithm) throws TNoSuchAlgorithmException {
        return new TKeyFactory(algorithm);
    }

    public static TKeyFactory getInstance(String algorithm, String provider) throws TNoSuchAlgorithmException {
        return new TKeyFactory(algorithm);
    }

    public static TKeyFactory getInstance(String algorithm, Provider provider) throws TNoSuchAlgorithmException {
        return new TKeyFactory(algorithm);
    }

    public final Provider getProvider() {
        return null;
    }

    public final String getAlgorithm() {
        return this.algorithm;
    }

    public final PublicKey generatePublic(KeySpec keySpec) throws InvalidKeySpecException {
        throw new InvalidKeySpecException("Unimplemented");
    }

    public final PrivateKey generatePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        throw new InvalidKeySpecException("Unimplemented");
    }
}
