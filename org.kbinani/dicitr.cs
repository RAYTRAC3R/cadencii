
#if JAVA
package org.kbinani;
#else
#if !__cplusplus
using System;
using System.IO;
using System.Collections.Generic;

#endif
namespace org
{
    namespace kbinani
    {
#if !__cplusplus
        using int8_t = System.SByte;
        using int16_t = System.Int16;
        using int32_t = System.Int32;
        using int64_t = System.Int64;
        using uint8_t = System.Byte;
        using uint16_t = System.UInt16;
        using uint32_t = System.UInt32;
        using uint64_t = System.UInt64;
#endif
#endif

#if !JAVA
        public class dicitr<K, V>
        {
            Dictionary<K, V> mDict;
            Dictionary<K, V>.KeyCollection.Enumerator itr;
            bool mHasNext = false;

            public dicitr( Dictionary<K, V> dict )
            {
                mDict = dict;
                itr = mDict.Keys.GetEnumerator();
                mHasNext = itr.MoveNext();
            }

            public bool hasNext()
            {
                return mHasNext;
            }

            public K next()
            {
                K ret = itr.Current;
                mHasNext = itr.MoveNext();
                return ret;
            }
        };
#endif

#if !JAVA
    }
}
#endif