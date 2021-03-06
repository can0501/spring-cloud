package com.example.dubbo_provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.ProviderService;

// ！duboo的包  com.alibaba.dubbo.config.annotation.Service
@Service
public class ProviderServiceImpl implements ProviderService {
    @Override
    public String provider(String s) {
        return "Dubbo服务【RPC】：" + s;
    }
}
