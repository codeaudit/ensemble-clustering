/**
 * Copyright (c) 2013 Oculus Info Inc.
 * http://www.oculusinfo.com/
 *
 * Released under the MIT License.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:

 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.

 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.oculusinfo.ml.spark.unsupervised.cluster;

import java.util.Iterator;

import spark.api.java.JavaPairRDD;

import com.oculusinfo.ml.Instance;
import com.oculusinfo.ml.unsupervised.cluster.Cluster;
import com.oculusinfo.ml.unsupervised.cluster.ClusterResult;

public class SparkClusterResult implements ClusterResult {
	private static final long serialVersionUID = -1586537333107747750L;
	
	JavaPairRDD<String, Instance> rdd;
	
	public SparkClusterResult(JavaPairRDD<String, Instance> clusters) {
		rdd = clusters;
	}
	
	public JavaPairRDD<String, Instance> getRDD() {
		return rdd;
	}
	
	@Override
	public Iterator<Cluster> iterator() {
		throw new RuntimeException("Iterator is not supported for SparkClusterResult");
	}

	@Override
	public boolean isEmpty() {
		throw new RuntimeException("isEmpty is not supported for SparkClusterResult");
	}

	@Override
	public int size() {
		throw new RuntimeException("size is not supported for SparkClusterResult");
	}

}
