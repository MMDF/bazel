// Copyright 2018 The Bazel Authors. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.devtools.build.lib.skylarkbuildapi;

import com.google.devtools.build.lib.skylarkinterface.SkylarkModule;
import com.google.devtools.build.lib.skylarkinterface.SkylarkModuleCategory;
import com.google.devtools.build.lib.syntax.StarlarkValue;

/** The interface for Starlark-defined aspects in the Build API. */
@SkylarkModule(
    name = "Aspect",
    category = SkylarkModuleCategory.BUILTIN,
    doc =
        "For more information about Aspects, please consult the <a href=\"globals.html#aspect\">"
            + "documentation of the aspect function</a> or the "
            + "<a href=\"../aspects.md\">introduction to Aspects</a>.")
public interface SkylarkAspectApi extends StarlarkValue {}
