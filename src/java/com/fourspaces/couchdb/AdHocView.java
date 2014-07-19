/*
   Copyright 2007 Fourspaces Consulting, LLC

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

package com.fourspaces.couchdb;

/**
 * Creates an AdHoc view... this basically just creates a new View with a name
 * of "_temp_view" and a defined function.
 * 
 * @author mbreese
 *
 */
public class AdHocView extends View {
  private String mapFunction;
  private String reduceFunction;

  public AdHocView() {
  }

  public AdHocView(String mapFunction, String reduceFunction) {
		super("_temp_view");
		this.mapFunction=mapFunction;
    this.reduceFunction=reduceFunction;
	}

  public String getMapFunction() {
    return mapFunction;
  }

  public void setMapFunction(String mapFunction) {
    this.mapFunction = mapFunction;
  }

  public String getReduceFunction() {
    return reduceFunction;
  }

  public void setReduceFunction(String reduceFunction) {
    this.reduceFunction = reduceFunction;
  }
}
