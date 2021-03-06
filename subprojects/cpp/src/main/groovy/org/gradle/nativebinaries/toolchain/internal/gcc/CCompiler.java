/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.nativebinaries.toolchain.internal.gcc;

import org.gradle.nativebinaries.language.c.internal.CCompileSpec;
import org.gradle.nativebinaries.toolchain.internal.CommandLineTool;
import org.gradle.nativebinaries.toolchain.internal.CommandLineToolInvocation;

class CCompiler extends NativeCompiler<CCompileSpec> {

    public CCompiler(CommandLineTool commandLineTool, CommandLineToolInvocation baseInvocation, boolean useCommandFile) {
        super(commandLineTool, baseInvocation, new CCompileArgsTransformer(), useCommandFile);
    }

    private static class CCompileArgsTransformer extends GccCompilerArgsTransformer<CCompileSpec> {
        protected String getLanguage() {
            return "c";
        }
    }
}
