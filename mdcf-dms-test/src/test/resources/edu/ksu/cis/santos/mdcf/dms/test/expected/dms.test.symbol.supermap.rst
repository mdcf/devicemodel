Super Transitive Map
====================

* Int: IntegralType, Number
* IntegralType: Number
* Nat: Int, IntegralType, Number
* clas.ICEBloodPressure: schema.ICEDevice
* clas.ICEBloodPressureParam: schema.ICEPhysioParameter
* clas.ICEMultiMonitor: schema.ICEDevice
* clas.ICEPulseOx: schema.ICEDevice
* clas.ICEPulseRate: schema.ICEPhysioParameter
* clas.ICESpO2: schema.ICEPhysioParameter
* device.MultiMonitor: clas.ICEMultiMonitor, schema.ICEDevice
* device.NellcorPulseOx: clas.ICEPulseOx, schema.ICEDevice
* device.NoninPulseOx: clas.ICEPulseOx, schema.ICEDevice
* schema.BatteryLevelStatus: schema.ICEDeviceStatus
* schema.ClientInitiated: schema.ICEDataExchange
* schema.ComplexAlert: schema.ICEAlert
* schema.DistributionSA: schema.ICEMetric, schema.SampleArray
* schema.Episodic: schema.ICEDataExchange, schema.ProviderInitiated
* schema.IntRange: schema.Range
* schema.IntRangeSetting: schema.ICEDeviceSetting, schema.RangeSetting
* schema.MetricTimeStampAttributes: schema.MetricAttribute
* schema.NatRange: schema.Range
* schema.Numeric: schema.ICEMetric
* schema.ObsValue: schema.ICEMessageContext
* schema.Periodic: schema.ICEDataExchange, schema.ProviderInitiated
* schema.ProviderInitiated: schema.ICEDataExchange
* schema.RangeSetting: schema.ICEDeviceSetting
* schema.RangeValueAlert: schema.ICEAlert, schema.ICEDeviceSetting, schema.RangeSetting
* schema.RealTimeSA: schema.ICEMetric, schema.SampleArray
* schema.SampleArray: schema.ICEMetric
* schema.StatusAttributes: schema.MetricAttribute
* schema.TargetValueAlert: schema.ICEAlert, schema.ICEDeviceSetting, schema.ValueSetting
* schema.TimeSA: schema.ICEMetric, schema.SampleArray
* schema.ValueChangeAlert: schema.ICEAlert
* schema.ValueSetting: schema.ICEDeviceSetting